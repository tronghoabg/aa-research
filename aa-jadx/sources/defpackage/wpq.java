package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wpq implements android.view.View.OnTouchListener {
    private final android.app.Dialog a;
    private final int b;
    private final int c;

    public wpq(android.app.Dialog dialog, android.graphics.Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        android.view.ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View viewFindViewById = view.findViewById(android.R.id.content);
        int left = this.b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.c + viewFindViewById.getTop();
        if (new android.graphics.RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.a.onTouchEvent(motionEventObtain);
    }
}
