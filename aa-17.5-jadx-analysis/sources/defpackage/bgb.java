package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bgb implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bgb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        dft dftVarN = null;
        switch (this.b) {
            case 0:
                View view = ((bgg) this.a).a;
                afdr afdrVar = (afdr) obj;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    afdrVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ne(afdrVar, 5, null == true ? 1 : 0));
                    }
                }
                return afak.a;
            case 1:
                ((cun) obj).x((cuo) this.a, 0, 0);
                return afak.a;
            case 2:
                ActionMode actionMode = ((bgg) this.a).f;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return afak.a;
            case 3:
                ActionMode actionMode2 = ((bgg) this.a).f;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return afak.a;
            case 4:
                this.a.b((cst) obj);
                return afak.a;
            case 5:
                Object obj2 = this.a;
                ((bgg) obj2).c.c();
                return new agj(obj2, 7);
            case 6:
                this.a.b((cst) obj);
                return afak.a;
            case 7:
                cmd cmdVar = (cmd) obj;
                cju cjuVarB = cmdVar.r().b();
                int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (cmdVar.o() >> 32));
                int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L));
                Drawable drawable = (Drawable) this.a;
                drawable.setBounds(0, 0, iIntBitsToFloat, iIntBitsToFloat2);
                drawable.draw(cjf.a(cjuVarB));
                return afak.a;
            case 8:
                bii biiVar = (bii) obj;
                ?? r0 = this.a;
                bgz bgzVar = (bgz) r0;
                bwq bwqVar = bgzVar.c;
                afeg afegVar = bgzVar.a;
                Context context = (Context) bwqVar.a();
                if (context == null) {
                    context = (Context) bzi.x(r0, daa.b);
                }
                afegVar.invoke(biiVar, context);
                return afak.a;
            case 9:
                cyz cyzVar = (cyz) obj;
                if (cyzVar instanceof bgx) {
                    this.a.invoke(((bgx) cyzVar).a);
                    return true;
                }
                if (!(cyzVar instanceof bha)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                throw null;
            case 10:
                ((afec) obj).invoke(this.a);
                return afak.a;
            case 11:
                return new agj(this.a, 8);
            case 12:
                this.a.b((cst) obj);
                return afak.a;
            case 13:
                bid bidVar = (bid) this.a;
                bidVar.c.j(true);
                bidVar.c.f(true);
                bed bedVar = bidVar.c;
                CharSequence charSequenceB = ((cgh) obj).b();
                charSequenceB.getClass();
                bid.b(bedVar, (String) charSequenceB, bidVar.d);
                return true;
            case 14:
                List list = (List) obj;
                bid bidVar2 = (bid) this.a;
                if (bidVar2.c.d() != null) {
                    bff bffVarD = bidVar2.c.d();
                    bffVarD.getClass();
                    list.add(bffVarD.a);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                String str = ((deu) obj).b;
                bid bidVar3 = (bid) this.a;
                bid.b(bidVar3.c, str, bidVar3.d);
                return true;
            case 16:
                deu deuVar = (deu) obj;
                bid bidVar4 = (bid) this.a;
                if (bidVar4.d) {
                    fbf fbfVar = bidVar4.c.s;
                    if (fbfVar != null) {
                        List listBi = woy.bi(new djb(), new diu(deuVar, 1));
                        bed bedVar2 = bidVar4.c;
                        asl.ad(listBi, bedVar2.t, bedVar2.m, fbfVar);
                    } else {
                        String strA = bidVar4.b.a();
                        int iE = dfv.e(bidVar4.b.b);
                        int iA = dfv.a(bidVar4.b.b);
                        strA.getClass();
                        deuVar.getClass();
                        if (iA < iE) {
                            throw new IndexOutOfBoundsException(a.bB(iE, iA, "End index (", ") is less than start index (", ")."));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) strA, 0, iE);
                        sb.append((CharSequence) deuVar);
                        sb.append((CharSequence) strA, iA, strA.length());
                        String string = sb.toString();
                        int iE2 = dfv.e(bidVar4.b.b) + deuVar.a();
                        bidVar4.c.m.invoke(new djv(string, czz.t(iE2, iE2), 4));
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 17:
                ((biq) this.a).a((diz) obj);
                return afak.a;
            case 18:
                ((cun) obj).r((cuo) this.a, 0, 0, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 19:
                List list2 = (List) obj;
                bjg bjgVar = (bjg) this.a;
                dft dftVar = bjgVar.d().c;
                if (dftVar != null) {
                    dfw dfwVar = bjgVar.b;
                    float[] fArr = clj.a;
                    dfw dfwVarW = dfw.w(dfwVar, cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u), 0L, null, 0L, null, 0, 0L, 16777214);
                    dfs dfsVar = dftVar.a;
                    dftVarN = dftVar.n(new dfs(dfsVar.a, dfwVarW, dfsVar.c, dfsVar.d, dfsVar.e, dfsVar.f, dfsVar.g, dfsVar.h, dfsVar.j, dfsVar.i), dftVar.c);
                    list2.add(dftVarN);
                }
                return Boolean.valueOf(dftVarN != null);
            default:
                deu deuVar2 = (deu) obj;
                bjg bjgVar2 = (bjg) this.a;
                bjf bjfVar = bjgVar2.h;
                if (bjfVar == null) {
                    bjf bjfVar2 = new bjf(bjgVar2.a, deuVar2);
                    biu biuVar = new biu(deuVar2, bjgVar2.b, bjgVar2.i, bjgVar2.c, bjgVar2.d, bjgVar2.e, bjgVar2.f, afbe.a);
                    biuVar.h(bjgVar2.d().b);
                    bjfVar2.d = biuVar;
                    bjgVar2.h = bjfVar2;
                } else if (!affa.f(deuVar2, bjfVar.b)) {
                    bjfVar.b = deuVar2;
                    biu biuVar2 = bjfVar.d;
                    if (biuVar2 != null) {
                        biuVar2.i(deuVar2, bjgVar2.b, bjgVar2.i, bjgVar2.c, bjgVar2.d, bjgVar2.e, bjgVar2.f, afbe.a);
                    }
                }
                bjgVar2.m();
                return true;
        }
    }
}
