package defpackage;

import android.text.TextUtils;
import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class lye implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ lye(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Optional) obj).isPresent();
            case 1:
                return ((mqc) obj).a.e();
            case 2:
                return Objects.nonNull((NavigationSuggestion) obj);
            case 3:
                yph yphVar = lzp.a;
                return roc.au((mqc) obj);
            case 4:
                yfq yfqVar = map.a;
                return roc.au((mqc) obj);
            case 5:
                yph yphVar2 = mbw.a;
                ((mbv) obj).f();
                return true;
            case 6:
                int i = mca.b;
                return ((mbz) obj).c.C;
            case 7:
                yph yphVar3 = mil.a;
                return !((mih) ((Map.Entry) obj).getKey()).c();
            case 8:
                return !TextUtils.isEmpty((String) obj);
            case 9:
                return Objects.nonNull((String) obj);
            case 10:
                return ((kqg) obj).l();
            case 11:
                return !((ojn) obj).d();
            case 12:
                return lhb.a(mki.a.c.getPackageManager(), ((mqz) obj).c.a());
            case 13:
                int i2 = mqi.f;
                return Objects.nonNull(obj);
            case 14:
                return Objects.nonNull((mqp) obj);
            case 15:
                yph yphVar4 = mqq.a;
                return nrz.e().g(((mqq) obj).c.a());
            case 16:
                yph yphVar5 = mqq.a;
                return roc.aw((mqc) obj);
            case 17:
                return Objects.nonNull((mrg) obj);
            case 18:
                return (((mrg) obj).b & 4) != 0;
            case 19:
                yph yphVar6 = mrj.a;
                return mrf.a(((mrg) obj).c) != mrf.ASSISTANT_SHORTCUT_RECORD;
            default:
                return Objects.nonNull((mrl) obj);
        }
    }
}
