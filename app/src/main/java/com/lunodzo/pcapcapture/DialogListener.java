package com.lunodzo.pcapcapture;

import android.app.DialogFragment;

public interface DialogListener {
    public void onDialogPositiveClick(DialogFragment dialog, int id);
    public void onDialogNegativeClick(DialogFragment dialog, int id);
    public void onDialogNeutralClick(DialogFragment dialog, int id);
}