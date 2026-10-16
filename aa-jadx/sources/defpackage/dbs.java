package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dbs implements android.view.GestureDetector.OnGestureListener {
    final /* synthetic */ defpackage.dbt a;

    public dbs(defpackage.dbt dbtVar) {
        this.a = dbtVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        defpackage.dbt dbtVar = this.a;
        if (!dbtVar.c) {
            int i = dbtVar.b;
            if (defpackage.a.X(i, 1)) {
                if (java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
                    dbtVar.a.invoke(new defpackage.chz(f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : 2));
                }
            } else if (defpackage.a.X(i, 2) && java.lang.Math.abs(f2) > java.lang.Math.abs(f)) {
                dbtVar.a.invoke(new defpackage.chz(f2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : 2));
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent motionEvent) {
    }
}
