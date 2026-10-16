package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public final class GuiUtils {
    public static final float MIN_TEXT_XSCALE = 0.6f;
    private static final java.lang.String MORE_SUGGESTIONS_HINT = "…";

    public static class NotOnUiThreadException extends java.lang.RuntimeException {
    }

    public static void assertOnMainThread() {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            throw new com.google.android.libraries.handwriting.gui.GuiUtils.NotOnUiThreadException();
        }
    }

    public static android.app.Dialog createErrorDialog(android.content.Context context, java.lang.String str, java.lang.String str2, final java.lang.Runnable runnable) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.libraries.handwriting.gui.GuiUtils.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        return builder.create();
    }

    public static android.app.Dialog createErrorDialogThatCancelsActivity(android.content.Context context, java.lang.String str, java.lang.String str2, final android.app.Activity activity) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(android.R.string.ok, new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.libraries.handwriting.gui.GuiUtils.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i) {
                activity.finish();
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }

    public static void formatResultTextInTextView(java.lang.String str, android.widget.TextView textView, float f, java.lang.String str2, android.graphics.drawable.Drawable drawable) {
        textView.setText(str);
        textView.setContentDescription((str.startsWith(" ") ? java.lang.String.valueOf(str2).concat(" ") : "").concat(java.lang.String.valueOf(str)));
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (str.startsWith(" ")) {
            spannableString.setSpan(new android.text.style.ImageSpan(drawable, 1), 0, 1, 33);
        }
        float textScaleX = f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? getTextScaleX(spannableString, f, textView.getPaint()) : 1.0f;
        textView.setText(spannableString);
        textView.setTextScaleX(textScaleX);
    }

    public static android.graphics.drawable.Drawable getMoreCandidatesHint(android.content.res.Resources resources, float f, int i) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setColor(i);
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds("…", 0, 1, rect);
        int iRound = java.lang.Math.round(rect.width() + 0.5f);
        int iRound2 = java.lang.Math.round(rect.height() + 0.5f);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iRound, (iRound2 * 3) / 2, android.graphics.Bitmap.Config.ARGB_8888);
        new android.graphics.Canvas(bitmapCreateBitmap).drawText("…", iRound / 2, iRound2, paint);
        return new android.graphics.drawable.BitmapDrawable(resources, bitmapCreateBitmap);
    }

    public static android.graphics.drawable.Drawable getPrespaceDrawable(android.content.res.Resources resources, float f, int i, float f2) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setStrokeWidth(f2);
        paint.setColor(i);
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds("_", 0, 1, rect);
        int iMax = java.lang.Math.max(java.lang.Math.round(rect.width() + 0.5f), 3);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMax, iMax / 3, android.graphics.Bitmap.Config.ARGB_8888);
        float f3 = iMax;
        float f4 = 0.3f * f3;
        new android.graphics.Canvas(bitmapCreateBitmap).drawLines(new float[]{com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f4, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f4, f3, f4, f3, f4, f3, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED}, paint);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        return bitmapDrawable;
    }

    public static float getTextScaleX(android.text.SpannableString spannableString, float f, android.graphics.Paint paint) {
        float f2 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        java.lang.String string = spannableString.toString();
        paint.setTextScaleX(1.0f);
        int length = string.length();
        if (length == 0) {
            return 1.0f;
        }
        float[] fArr = new float[length];
        int textWidths = paint.getTextWidths(string, 0, string.length(), fArr);
        for (int i = 0; i < textWidths; i++) {
            f2 += fArr[i];
        }
        float f3 = f / f2;
        if (f3 > 1.0f) {
            return 1.0f;
        }
        if (f3 < 0.6f) {
            return 0.6f;
        }
        return f3;
    }

    public static android.app.Dialog createErrorDialog(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return createErrorDialog(context, str, str2, null);
    }
}
