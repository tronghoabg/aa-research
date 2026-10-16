package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.auto.components.metadataview.MetadataView;
import com.google.android.apps.auto.components.permission.impl.PermissionPollerImpl;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
import j$.time.Instant;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class lqj implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lqj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [mnq] */
    /* JADX WARN: Type inference failed for: r6v22, types: [moa] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v61 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.b) {
            case 0:
                ((lql) this.a).b("was_any_playback_interval_over_threshold", true);
                return;
            case 1:
                Object obj = this.a;
                ((eqj) obj).m(((lqf) obj).i);
                return;
            case 2:
                lql lqlVar = (lql) this.a;
                lqlVar.b("autoplay_on_start", lqlVar.g);
                return;
            case 3:
                lqp lqpVar = lqq.b;
                ogz ogzVar = ((lqt) this.a).a().d;
                ogzVar.getClass();
                ogzVar.d(yzz.MEDIA_AUTOPLAY).c();
                return;
            case 4:
                Object obj2 = this.a;
                lro lroVar = (lro) obj2;
                lroVar.h = true;
                if (lroVar.i) {
                    ((eqj) obj2).m(lroVar.a);
                    return;
                }
                return;
            case 5:
                Object obj3 = this.a;
                ((eqj) obj3).m(((lsa) obj3).h);
                return;
            case 6:
                ((ype) ((ype) lsv.a.f()).ai((char) 4264)).u("Media stream item hasn't been interacted with in a while. Removing");
                ((lsv) this.a).a();
                return;
            case 7:
                mcb.b().a((String) this.a).b(ogb.k() ? nuo.h : null);
                return;
            case 8:
                yph yphVar = lvq.a;
                Object obj4 = this.a;
                moc mocVar = (moc) obj4;
                moa moaVarA = mlq.e().a(mocVar.j, mocVar.k);
                lxb lxdVar = obj4;
                if (moaVarA instanceof lxd) {
                    lxd lxdVar2 = (lxd) moaVarA;
                    ((ype) lvq.a.l().ai((char) 4323)).u("Updating existing SMS conversation");
                    yfq yfqVarO = yfq.o(((lxd) obj4).b);
                    ArrayList arrayList = new ArrayList(lxdVar2.b);
                    arrayList.addAll(yfqVarO);
                    lxc lxcVar = new lxc();
                    lxcVar.b(lxdVar2);
                    oit.a();
                    lxcVar.m = Instant.now().toEpochMilli();
                    lxcVar.a = arrayList;
                    lxcVar.b = lxdVar2.a;
                    lxcVar.c = lxdVar2.c;
                    oit.a();
                    lxcVar.d = Instant.now().toEpochMilli();
                    lxcVar.i = lxdVar2.l;
                    lxcVar.f = lxdVar2.f;
                    lxcVar.g = lxdVar2.g;
                    lxdVar = new lxd(lxcVar);
                }
                if (lxdVar.m() && lxdVar.a() > 0) {
                    z = true;
                }
                lxdVar.r = z;
                mlq.e().j(lxdVar);
                return;
            case 9:
                yph yphVar2 = lwl.a;
                lwg.a().b((String) this.a);
                return;
            case 10:
                yph yphVar3 = lwm.a;
                lwg.a().b((String) this.a);
                return;
            case 11:
                yph yphVar4 = lwm.a;
                lvg lvgVarA = lnm.m().a(((Intent) this.a).getLongExtra("EXTRA_CONVERSATION_ID", 0L));
                ((ype) lwm.a.l().ai((char) 4417)).y("Muting conversation %s", lvgVarA);
                lnm.j().g(lvgVarA, true);
                return;
            case 12:
                ype ypeVar = (ype) MetadataView.a.l().ai(4463);
                MetadataView metadataView = (MetadataView) this.a;
                ypeVar.y("onImageLoadTimeout currentModel=%s", metadataView.j);
                metadataView.a(false);
                metadataView.g(metadataView.j);
                lyy lyyVar = metadataView.f;
                if (lyyVar != null) {
                    lyyVar.m();
                    return;
                }
                return;
            case 13:
                Object obj5 = this.a;
                ((lzc) obj5).j(lzb.c);
                lze lzeVar = (lze) obj5;
                lzeVar.e.c(lzeVar.f);
                return;
            case 14:
                nsy.a().b((TurnEvent) this.a);
                return;
            case 15:
                Object obj6 = this.a;
                synchronized (((lzw) obj6).d) {
                    lzy lzyVar = ((lzw) obj6).e;
                    if (lzyVar != null && !lzyVar.f) {
                        ((lzw) obj6).b();
                        return;
                    }
                    return;
                }
            case 16:
                wer.c();
                ((ype) ((ype) lzw.a.h()).ai((char) 4558)).u("onNavigationServiceInitFailed");
                Object obj7 = this.a;
                lzy lzyVar2 = (lzy) obj7;
                ComponentName componentName = lzyVar2.d;
                lzx lzxVar = lzyVar2.e;
                lzw lzwVar = (lzw) lzxVar;
                lzwVar.c.n(componentName, "Navigation service init failed");
                synchronized (lzwVar.d) {
                    ((lzw) lzxVar).d((lzy) obj7);
                }
                return;
            case 17:
                mal malVar = (mal) ((mak) this.a).a.get();
                if (malVar == null) {
                    return;
                }
                malVar.d = false;
                malVar.e(maj.b);
                return;
            case 18:
                ((maq) this.a).b();
                return;
            case 19:
                mdu mduVar = (mdu) this.a;
                if (!mduVar.b.d()) {
                    mduVar.g.d.postDelayed(this, 100L);
                    return;
                } else {
                    yph yphVar5 = PermissionPollerImpl.a;
                    mduVar.b();
                    return;
                }
            default:
                ((ype) ((ype) PermissionPollerImpl.a.g()).ai((char) 4797)).u("Timed out while getting permissions.");
                mdu mduVar2 = (mdu) this.a;
                mduVar2.a(yzy.qj);
                if (acxa.aL()) {
                    mduVar2.c();
                    mduVar2.c.b();
                    return;
                } else {
                    mduVar2.c.b();
                    mduVar2.c();
                    return;
                }
        }
    }

    public lqj(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
