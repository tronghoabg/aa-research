package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class koe implements rkz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ koe(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.rkz
    public final Object a(pat patVar) throws IOException {
        int i = this.c;
        if (i == 0) {
            if (patVar == pat.IO_EXCEPTION) {
                throw new IOException("Failed to write due to failure injection");
            }
            ((kog) this.b).a.write(this.a);
            return null;
        }
        if (i != 1) {
            if (patVar != pat.IO_EXCEPTION_IF_NOT_PING_MESSAGE) {
                return false;
            }
            int i2 = this.a;
            Object obj = this.b;
            if (i2 - 1 != 0) {
                ((ype) ((ype) phu.a.g()).ai((char) 6714)).u("Failure injected on WPP write.");
                ((phu) obj).d.e();
            } else {
                ((ype) ((ype) phu.a.g()).ai((char) 6713)).u("Failure injected during WPP read.");
                ((phu) obj).d.c();
            }
            return true;
        }
        if (patVar != pat.IO_EXCEPTION_IF_NOT_PING_MESSAGE) {
            return false;
        }
        int i3 = this.a;
        yop yopVarAi = izu.a.l().ai(1691);
        int iQ = wub.q(i3);
        if (iQ == 0) {
            throw null;
        }
        Object obj2 = this.b;
        yopVarAi.y("Activating Failure Injection on GAL message: %s", wub.p(iQ));
        ((izu) obj2).h(false, yze.PROTOCOL_IO_ERROR, yzf.UNKNOWN_DETAIL, "Failure Injection Error");
        return true;
    }
}
