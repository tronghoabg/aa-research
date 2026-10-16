package kotlinx.b.c;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag implements kotlinx.b.b {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f50956a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f50957b;

    public ag(String str, Enum[] enumArr) {
        h.g.b.x.f(str, "serialName");
        h.g.b.x.f(enumArr, "values");
        this.f50956a = enumArr;
        this.f50957b = h.g.a(new cg(this, str, 1));
    }

    static final kotlinx.b.a.q a(ag agVar, String str) {
        Enum[] enumArr = agVar.f50956a;
        af afVar = new af(str, enumArr.length);
        for (Enum r0 : enumArr) {
            afVar.l(r0.name(), false);
        }
        return afVar;
    }

    @Override // kotlinx.b.a
    public final /* bridge */ /* synthetic */ Object deserialize(kotlinx.b.b.e eVar) {
        h.g.b.x.f(eVar, "decoder");
        int iDecodeEnum = eVar.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            Enum[] enumArr = this.f50956a;
            if (iDecodeEnum < enumArr.length) {
                return enumArr[iDecodeEnum];
            }
        }
        throw new kotlinx.b.k(iDecodeEnum + " is not among valid " + getDescriptor().d() + " enum values, values size is " + this.f50956a.length);
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final kotlinx.b.a.q getDescriptor() {
        return (kotlinx.b.a.q) this.f50957b.getValue();
    }

    @Override // kotlinx.b.l
    public final /* bridge */ /* synthetic */ void serialize(kotlinx.b.b.f fVar, Object obj) {
        Enum r5 = (Enum) obj;
        h.g.b.x.f(fVar, "encoder");
        h.g.b.x.f(r5, "value");
        Enum[] enumArr = this.f50956a;
        int iC = h.a.c.C(enumArr, r5);
        if (iC != -1) {
            fVar.encodeEnum(getDescriptor(), iC);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().d());
        sb.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        h.g.b.x.e(string, "toString(...)");
        sb.append(string);
        throw new kotlinx.b.k(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().d() + '>';
    }
}
