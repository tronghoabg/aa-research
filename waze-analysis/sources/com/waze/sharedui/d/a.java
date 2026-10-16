package com.waze.sharedui.d;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsControllerCompat;
import com.waze.R;
import com.waze.shared_infra.g.e;
import com.waze.sharedui.d.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a extends d {
    public a(Context context) {
        super(context, R.style.BottomSheetDialog);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Rect rect = new Rect();
            viewGroup.getChildAt(0).getHitRect(rect);
            rect.right += iArr[0];
            rect.left += iArr[0];
            rect.top += iArr[1];
            rect.bottom += iArr[1];
            if (!rect.contains(x, y)) {
                e();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected void e() {
        cancel();
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = getWindow();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.gravity = 80;
        layoutParams.height = -1;
        layoutParams.width = -1;
        window.setAttributes(layoutParams);
    }

    @Override // android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i2) {
        super.setContentView(R.layout.base_bottom_dialog_layout);
        LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) bA().e(R.id.baseBottomDialog), true);
    }

    protected final void u(View view) {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        e.f(window);
        e.b((ViewGroup) findViewById(R.id.baseBottomDialog), view);
        new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightNavigationBars((getContext().getResources().getConfiguration().uiMode & 48) == 16);
    }
}
