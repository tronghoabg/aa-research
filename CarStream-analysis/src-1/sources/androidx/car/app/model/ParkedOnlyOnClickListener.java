package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class ParkedOnlyOnClickListener implements OnClickListener {
    private final OnClickListener mListener;

    private ParkedOnlyOnClickListener(OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    public static ParkedOnlyOnClickListener create(OnClickListener onClickListener) {
        Objects.requireNonNull(onClickListener);
        return new ParkedOnlyOnClickListener(onClickListener);
    }

    @Override // androidx.car.app.model.OnClickListener
    public void onClick() {
        this.mListener.onClick();
    }
}
