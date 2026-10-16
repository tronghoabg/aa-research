package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agyn extends aioy {
    final /* synthetic */ afec<ahxe, Collection> $onJavaStaticScope;
    final /* synthetic */ Set $result;
    final /* synthetic */ agba $root;

    /* JADX WARN: Multi-variable type inference failed */
    public agyn(agba agbaVar, Set set, afec<? super ahxe, ? extends Collection> afecVar) {
        this.$root = agbaVar;
        this.$result = set;
        this.$onJavaStaticScope = afecVar;
    }

    @Override // defpackage.aioy, defpackage.aipa
    public boolean beforeChildren(agba agbaVar) {
        agbaVar.getClass();
        if (agbaVar == this.$root) {
            return true;
        }
        ahxe staticScope = agbaVar.getStaticScope();
        staticScope.getClass();
        if (!(staticScope instanceof agyp)) {
            return true;
        }
        this.$result.addAll(this.$onJavaStaticScope.invoke(staticScope));
        return false;
    }

    @Override // defpackage.aipa
    public /* bridge */ /* synthetic */ Object result() {
        return afak.a;
    }

    /* renamed from: result, reason: collision with other method in class */
    public void m85result() {
    }
}
