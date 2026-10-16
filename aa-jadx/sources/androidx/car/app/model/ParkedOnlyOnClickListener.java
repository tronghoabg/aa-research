package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class ParkedOnlyOnClickListener implements defpackage.ux {
    private final defpackage.ux mListener;

    private ParkedOnlyOnClickListener(defpackage.ux uxVar) {
        this.mListener = uxVar;
    }

    public static androidx.car.app.model.ParkedOnlyOnClickListener create(defpackage.ux uxVar) {
        uxVar.getClass();
        return new androidx.car.app.model.ParkedOnlyOnClickListener(uxVar);
    }

    @Override // defpackage.ux
    public void onClick() {
        this.mListener.onClick();
    }
}
