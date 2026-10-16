package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.os.UserHandle;
import android.os.UserManager;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class koh implements Predicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ koh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.b) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v46, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = 5;
        switch (this.b) {
            case 0:
                pba pbaVar = (pba) obj;
                int i2 = pbaVar.e;
                Object obj2 = this.a;
                return i2 == 9 ? ((koo) obj2).l(pbaVar) : ((koo) obj2).c.contains(kom.b(pbaVar));
            case 1:
                pba pbaVar2 = (pba) obj;
                yph yphVar = koo.a;
                int i3 = pbaVar2.c;
                if (i3 == 11) {
                    par parVarB = par.b((i3 == 11 ? (pav) pbaVar2.d : pav.a).d);
                    if (parVarB == null) {
                        parVarB = par.CALL_SITE_UNSET;
                    }
                    if (parVarB.equals(this.a)) {
                        return true;
                    }
                }
                return false;
            case 2:
                yph yphVar2 = koo.a;
                return kom.b((pba) obj).equals(this.a);
            case 3:
                yph yphVar3 = koo.a;
                return kom.b((pba) obj) == this.a;
            case 4:
                kqg kqgVar = (kqg) obj;
                Stream stream = Collection.EL.stream(this.a);
                kqgVar.getClass();
                return stream.anyMatch(new koh(kqgVar, i));
            case 5:
                return ((kqg) this.a).n((kqg) obj);
            case 6:
                kqg kqgVar2 = (kqg) obj;
                Stream stream2 = Collection.EL.stream(this.a);
                kqgVar2.getClass();
                return stream2.noneMatch(new koh(kqgVar2, i));
            case 7:
                return !((kqg) this.a).n((kqg) obj);
            case 8:
                return ((UserManager) ((htm) this.a).a).isManagedProfile(((UserHandle) obj).getIdentifier());
            case 9:
                return ((BluetoothDevice) obj).getAddress().equals(((kxw) this.a).a);
            case 10:
                return ((yfq) this.a).contains((BluetoothDevice) obj);
            case 11:
                return ((String) this.a).equals((String) obj);
            case 12:
                Object obj3 = this.a;
                yph yphVar4 = kzg.a;
                return Objects.equals(((ComponentName) obj).getPackageName(), obj3);
            case 13:
                return ((ComponentName) this.a).equals((ComponentName) obj);
            case 14:
                yph yphVar5 = laa.a;
                return ((mqc) obj).a().equals(this.a);
            case 15:
                ?? r4 = this.a;
                ljo ljoVar = ljp.a;
                return ((Boolean) r4.invoke(obj)).booleanValue();
            case 16:
                return ((ComponentName) this.a).equals((ComponentName) obj);
            case 17:
                ?? r42 = this.a;
                int i4 = loh.a;
                return TextUtils.equals(((ComponentName) obj).getPackageName(), r42);
            case 18:
                return ((ComponentName) this.a).equals((ComponentName) obj);
            case 19:
                yph yphVar6 = loy.a;
                return ((mqc) obj).a().equals(((loz) this.a).a);
            default:
                yph yphVar7 = loy.a;
                return ((mqc) obj).a().equals(this.a);
        }
    }
}
