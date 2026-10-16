package f8;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes4.dex */
public final class e extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f35133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m mVar, int i5) {
        super(mVar);
        this.f35133e = i5;
    }

    @Override // f8.n
    public void r() {
        switch (this.f35133e) {
            case 0:
                m mVar = this.f35177b;
                mVar.f35168o = null;
                CheckableImageButton checkableImageButton = mVar.f35161g;
                checkableImageButton.setOnLongClickListener(null);
                gc.b.H(checkableImageButton, null);
                break;
        }
    }
}
