package in.mangaldeep88;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {
    private Button okbutton;
    private TextView result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        String resultText = "";
        okbutton = view.findViewById(R.id.result_ok_button);
        result = view.findViewById(R.id.result_text_view);

        Bundle bundle = getArguments();
        resultText = bundle.getString(MDFacey.RESULT_TEXT);
        result.setText(resultText);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return view;
    }
}
