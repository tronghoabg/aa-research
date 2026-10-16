package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h.a.c;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i2, boolean z, int i3) {
        this.key = i2;
        this.tracked = z;
        this.arity = i3;
    }

    static final ab invoke$lambda$0(Object[] objArr, int i2, ComposableLambdaNImpl composableLambdaNImpl, Composer composer, int i3) {
        Object[] array = c.S(objArr, n.u(0, i2)).toArray(new Object[0]);
        Object obj = objArr[i2 + 1];
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(((Integer) obj).intValue());
        int length = (objArr.length - i2) - 2;
        Object[] objArr2 = new Object[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj2 = objArr[i2 + 2 + i4];
            x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            objArr2[i4] = Integer.valueOf(RecomposeScopeImplKt.updateChangedFlags(((Integer) obj2).intValue()));
        }
        ArrayList arrayList = new ArrayList(4);
        x.q(array, arrayList);
        arrayList.add(composer);
        arrayList.add(Integer.valueOf(iUpdateChangedFlags | 1));
        x.q(objArr2, arrayList);
        composableLambdaNImpl.invoke(arrayList.toArray(new Object[arrayList.size()]));
        return ab.f48028a;
    }

    private final int realParamCount(int i2) {
        int i3 = i2 - 2;
        for (int i4 = 1; i4 * 10 < i3; i4++) {
            i3--;
        }
        return i3;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (!this.tracked || (recomposeScope = composer.getRecomposeScope()) == null) {
            return;
        }
        composer.recordUsed(recomposeScope);
        if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
            this.scope = recomposeScope;
            return;
        }
        List<RecomposeScope> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (ComposableLambdaKt.replacableWith(list.get(i2), recomposeScope)) {
                list.set(i2, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // h.g.b.s
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // h.g.a.x
    public Object invoke(final Object... objArr) {
        int length = objArr.length;
        final int iRealParamCount = realParamCount(length);
        Object obj = objArr[iRealParamCount];
        x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        int i2 = length - 1;
        Object[] array = c.S(objArr, n.u(0, i2)).toArray(new Object[0]);
        Object obj2 = objArr[i2];
        x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Composer composerStartRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(composerStartRestartGroup);
        int iDifferentBits = iIntValue | (composerStartRestartGroup.changed(this) ? ComposableLambdaKt.differentBits(iRealParamCount) : ComposableLambdaKt.sameBits(iRealParamCount));
        Object obj3 = this._block;
        x.d(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        ArrayList arrayList = new ArrayList(2);
        x.q(array, arrayList);
        arrayList.add(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((h.g.a.x) obj3).invoke(arrayList.toArray(new Object[arrayList.size()]));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.runtime.internal.ComposableLambdaNImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj4, Object obj5) {
                    return ComposableLambdaNImpl.invoke$lambda$0(objArr, iRealParamCount, this, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
        return objInvoke;
    }

    public final void update(Object obj) {
        if (x.n(obj, this._block)) {
            return;
        }
        Object obj2 = this._block;
        x.d(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (h.g.a.x) obj;
        if (obj2 != null) {
            trackWrite();
        }
    }
}
