package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class zej implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final yfq a;
    private final yfq b;

    public zej(Type[] typeArr, Type[] typeArr2) {
        zek.e(typeArr, "lower bound for wildcard");
        zek.e(typeArr2, "upper bound for wildcard");
        zee zeeVar = zee.e;
        this.a = zeeVar.a(typeArr);
        this.b = zeeVar.a(typeArr2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (yrm.W(this.a, Arrays.asList(wildcardType.getLowerBounds())) && yrm.W(this.b, Arrays.asList(wildcardType.getUpperBounds()))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        return zek.f(this.a);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return zek.f(this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable] */
    public final String toString() {
        int iAw;
        StringBuilder sb = new StringBuilder("?");
        int i = 0;
        while (true) {
            yfq yfqVar = this.a;
            if (i >= ((yls) yfqVar).c) {
                break;
            }
            Type type = (Type) yfqVar.get(i);
            sb.append(" super ");
            sb.append(zee.e.b(type));
            i++;
        }
        yfq yfqVar2 = this.b;
        if (yfqVar2 instanceof Collection) {
            iAw = ((yls) yfqVar2).c;
        } else {
            ynp ynpVarListIterator = yfqVar2.listIterator(0);
            long j = 0;
            while (ynpVarListIterator.hasNext()) {
                ynpVarListIterator.next();
                j++;
            }
            iAw = wub.aw(j);
        }
        yfq yfqVarAj = yfqVar2;
        if (iAw <= 1) {
            yfqVarAj = yrm.aj(yfqVar2, new xxl(new xxk(Object.class)));
        }
        if (!(yfqVarAj instanceof Collection) ? yfqVarAj.iterator().hasNext() : !yfqVarAj.isEmpty()) {
            sb.append(" extends ");
            xxd xxdVar = zek.b;
            zee zeeVar = zee.e;
            zeeVar.getClass();
            xxdVar.g(sb, yrm.am(yfqVarAj, new rgf(zeeVar, 19)));
        }
        return sb.toString();
    }
}
