package androidx.car.app.model;

import defpackage.rb;
import defpackage.us;

@rb
/* loaded from: classes2.dex */
public final class ParkedOnlyOnClickListener implements us {
    private final us mListener;

    private ParkedOnlyOnClickListener(us usVar) {
        this.mListener = usVar;
    }

    public static ParkedOnlyOnClickListener create(us usVar) {
        usVar.getClass();
        return new ParkedOnlyOnClickListener(usVar);
    }

    @Override // defpackage.us
    public void onClick() {
        this.mListener.onClick();
    }
}
