package com.waze.share;

import android.content.Intent;
import com.waze.R;
import com.waze.ht;
import com.waze.lm;
import com.waze.menus.SideMenuAutoCompleteRecycler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class w implements ht {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37746a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37747b;

    public /* synthetic */ w(Object obj, int i2) {
        this.f37747b = i2;
        this.f37746a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    @Override // com.waze.ht
    public final void a(Object obj) {
        if (this.f37747b != 0) {
            SideMenuAutoCompleteRecycler.aN((SideMenuAutoCompleteRecycler) this.f37746a, (Intent) obj);
            return;
        }
        Intent intent = (Intent) obj;
        com.waze.sharedui.a.e eVarE = lm.d().e();
        if (eVarE != null) {
            eVarE.startActivityForResult(Intent.createChooser(intent, this.f37746a.c(R.string.SHARE, new Object[0])), 4000);
        }
    }
}
