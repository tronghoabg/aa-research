package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.auto.template.icons.proxy.ProxyContentProvider;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gqj extends afde implements afeg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(afec afecVar, nuh nuhVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = afecVar;
        this.c = nuhVar;
        this.a = bwqVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [bwq, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            return new gqj((bwq) this.a, (bym) this.b, (byb) this.c, afckVar, 0);
        }
        if (i == 1) {
            return new gqj(this.c, (Context) this.a, (String) this.b, afckVar, 1);
        }
        if (i == 2) {
            Object obj2 = this.b;
            return new gqj((naq) obj2, (byd) this.a, (bym) this.c, afckVar, 2);
        }
        if (i == 3) {
            return new gqj((byd) this.c, (Map) this.b, (bwq) this.a, afckVar, 3);
        }
        if (i == 4) {
            return new gqj((not) this.c, (List) this.b, (bym) this.a, afckVar, 4);
        }
        if (i == 5) {
            return new gqj((afec) this.b, (nuh) this.c, (bwq) this.a, afckVar, 5);
        }
        Object obj3 = this.b;
        return new gqj((ProxyContentProvider) obj3, (Uri) this.a, (ParcelFileDescriptor) this.c, afckVar, 6);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v23, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Uri uri;
        Integer numC;
        int i = this.d;
        if (i == 0) {
            woy.dF(obj);
            if (!((Boolean) this.a.a()).booleanValue()) {
                ((byb) this.c).h(((Number) this.b.a()).floatValue());
            }
            return afak.a;
        }
        if (i == 1) {
            woy.dF(obj);
            try {
                uri = (Uri) this.c;
                List<String> pathSegments = uri.getPathSegments();
                pathSegments.getClass();
                String str = (String) woy.bK(pathSegments);
                str.getClass();
                numC = afyh.c(str);
            } catch (Exception unused) {
            }
            if (numC != null) {
                return ((Context) this.a).getDrawable(numC.intValue());
            }
            if (uri.getPathSegments().size() >= 2) {
                String str2 = uri.getPathSegments().get(0);
                String str3 = uri.getPathSegments().get(1);
                Object obj2 = this.a;
                int identifier = ((Context) obj2).getResources().getIdentifier(str3, str2, (String) this.b);
                if (identifier != 0) {
                    return ((Context) obj2).getDrawable(identifier);
                }
            }
            return null;
        }
        if (i == 2) {
            woy.dF(obj);
            byd bydVar = (byd) this.a;
            if (bydVar.e() != -1) {
                ((naq) this.b).b(woy.cd(roc.ag(this.c), bydVar.e()));
            }
            return afak.a;
        }
        if (i == 3) {
            woy.dF(obj);
            if (((byd) this.c).e() == 0) {
                nih.a.l().u("All animations finished, requesting focus on HOME");
                Object obj3 = this.b.get(nii.b);
                obj3.getClass();
                ((cil) obj3).a(7);
                this.a.b(true);
            }
            return afak.a;
        }
        if (i == 4) {
            woy.dF(obj);
            Object obj4 = this.c;
            if (obj4 != not.a && !this.b.contains(obj4)) {
                ((ype) nkl.a.h()).M("Current Fan Direction: %s, not in available set %s", obj4, nkl.a(this.a));
            }
            return afak.a;
        }
        if (i == 5) {
            woy.dF(obj);
            ?? r5 = this.a;
            yph yphVar = nxm.a;
            if (!((Boolean) r5.a()).booleanValue()) {
                this.b.invoke(this.c);
            }
            return afak.a;
        }
        woy.dF(obj);
        Object obj5 = this.c;
        obj5.getClass();
        tkm tkmVar = ((ProxyContentProvider) this.b).b;
        if (tkmVar == null) {
            affa.d("registrarIconFactory");
            tkmVar = null;
        }
        Bitmap bitmapD = szp.y(tkmVar, (Uri) this.a).d();
        if (bitmapD == null) {
            throw new IllegalStateException("Icon must be backed by a Bitmap");
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) obj5);
        try {
            bitmapD.compress(Bitmap.CompressFormat.PNG, 100, autoCloseOutputStream);
            autoCloseOutputStream.flush();
            affa.n(autoCloseOutputStream, null);
            return afak.a;
        } finally {
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 3) {
            return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 4) {
            return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 5) {
            return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((gqj) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(bwq bwqVar, bym bymVar, byb bybVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.a = bwqVar;
        this.b = bymVar;
        this.c = bybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(byd bydVar, Map map, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = bydVar;
        this.b = map;
        this.a = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(ProxyContentProvider proxyContentProvider, Uri uri, ParcelFileDescriptor parcelFileDescriptor, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = proxyContentProvider;
        this.a = uri;
        this.c = parcelFileDescriptor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(Object obj, Context context, String str, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = obj;
        this.a = context;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(naq naqVar, byd bydVar, bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.b = naqVar;
        this.a = bydVar;
        this.c = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj(not notVar, List list, bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = notVar;
        this.b = list;
        this.a = bymVar;
    }
}
