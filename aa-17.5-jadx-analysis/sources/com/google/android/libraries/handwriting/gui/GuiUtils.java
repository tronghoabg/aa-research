package com.google.android.libraries.handwriting.gui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class GuiUtils {
    public static final float MIN_TEXT_XSCALE = 0.6f;
    private static final String MORE_SUGGESTIONS_HINT = "…";

    public static class NotOnUiThreadException extends RuntimeException {
    }

    public static void assertOnMainThread() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new NotOnUiThreadException();
        }
    }

    public static Dialog createErrorDialog(Context context, String str, String str2, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.google.android.libraries.handwriting.gui.GuiUtils.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        return builder.create();
    }

    public static Dialog createErrorDialogThatCancelsActivity(Context context, String str, String str2, final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.google.android.libraries.handwriting.gui.GuiUtils.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.finish();
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }

    public static void formatResultTextInTextView(String str, TextView textView, float f, String str2, Drawable drawable) {
        textView.setText(str);
        textView.setContentDescription((str.startsWith(" ") ? String.valueOf(str2).concat(" ") : "").concat(String.valueOf(str)));
        SpannableString spannableString = new SpannableString(str);
        if (str.startsWith(" ")) {
            spannableString.setSpan(new ImageSpan(drawable, 1), 0, 1, 33);
        }
        float textScaleX = f > BitmapDescriptorFactory.HUE_RED ? getTextScaleX(spannableString, f, textView.getPaint()) : 1.0f;
        textView.setText(spannableString);
        textView.setTextScaleX(textScaleX);
    }

    public static Drawable getMoreCandidatesHint(Resources resources, float f, int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setColor(i);
        paint.getTextBounds("…", 0, 1, new Rect());
        int iRound = Math.round(r5.width() + 0.5f);
        int iRound2 = Math.round(r5.height() + 0.5f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, (iRound2 * 3) / 2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawText("…", iRound / 2, iRound2, paint);
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    public static Drawable getPrespaceDrawable(Resources resources, float f, int i, float f2) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f);
        paint.setStrokeWidth(f2);
        paint.setColor(i);
        paint.getTextBounds("_", 0, 1, new Rect());
        int iMax = Math.max(Math.round(r8.width() + 0.5f), 3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax / 3, Bitmap.Config.ARGB_8888);
        float f3 = iMax;
        float f4 = 0.3f * f3;
        new Canvas(bitmapCreateBitmap).drawLines(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, f4, f3, f4, f3, f4, f3, BitmapDescriptorFactory.HUE_RED}, paint);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        return bitmapDrawable;
    }

    public static float getTextScaleX(SpannableString spannableString, float f, Paint paint) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        String string = spannableString.toString();
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

    public static Dialog createErrorDialog(Context context, String str, String str2) {
        return createErrorDialog(context, str, str2, null);
    }
}
