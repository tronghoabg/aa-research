package com.waze.uid.state_impl.email;

import com.waze.R;
import com.waze.uid.UidModel;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab implements com.waze.uid.d.l {

    /* renamed from: a, reason: collision with root package name */
    private final bm f44643a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.uid.b.m f44644b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f44645c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f44646d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.tide.s f44647e;

    public /* synthetic */ ab(bm bmVar, com.waze.uid.b.m mVar, com.waze.tide.s sVar, h.g.a.a aVar, h.g.a.a aVar2) {
        this.f44643a = bmVar;
        this.f44644b = mVar;
        this.f44647e = sVar;
        this.f44645c = aVar;
        this.f44646d = aVar2;
        mVar.k(mVar.a().e(new bb(bmVar)));
    }

    @Override // com.waze.uid.d.l
    public final void a(com.waze.sharedui.b bVar) {
        h.g.b.x.f(bVar, "error");
        com.waze.uid.b.m mVar = this.f44644b;
        mVar.k(mVar.a().e(new bb(this.f44643a, null)));
        this.f44646d.invoke();
        if (!bVar.isSuccess()) {
            com.waze.uid.b.d dVar = this.f44647e;
            if (dVar == null) {
                dVar = new com.waze.uid.b.d(bVar);
            }
            mVar.w(dVar);
        }
        if (((UidModel) mVar.b()).getEmailParameters().getPinCodeToken().length() > 0) {
            mVar.w(new com.waze.uid.b.v(R.string.VERIFY_EMAIL_SENT_MSG, R.drawable.toast_check, null));
            this.f44645c.invoke();
        }
    }
}
