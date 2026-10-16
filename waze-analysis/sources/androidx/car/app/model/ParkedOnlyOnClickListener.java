package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class ParkedOnlyOnClickListener implements OnClickListener {
    private final OnClickListener mListener;

    private ParkedOnlyOnClickListener(OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    public static ParkedOnlyOnClickListener create(OnClickListener onClickListener) {
        return new ParkedOnlyOnClickListener((OnClickListener) Objects.requireNonNull(onClickListener));
    }

    @Override // androidx.car.app.model.OnClickListener
    public void onClick() {
        this.mListener.onClick();
    }
}
