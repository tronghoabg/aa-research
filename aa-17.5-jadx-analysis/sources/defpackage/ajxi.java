package defpackage;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public final class ajxi extends ajzc {
    private final Log b;
    private final ajpk c;
    private final akbh d;

    @Deprecated
    public ajxi(ajzu ajzuVar, ajpk ajpkVar, akas akasVar) {
        super(ajzuVar, akasVar);
        this.b = LogFactory.getLog(getClass());
        this.c = ajpkVar;
        this.d = new akbh(128);
    }

    @Override // defpackage.ajzc
    protected final /* bridge */ /* synthetic */ ajpg a(ajzu ajzuVar) throws ajpd, ajpr, IOException {
        int i = 0;
        int i2 = 0;
        while (true) {
            akbh akbhVar = this.d;
            akbhVar.i();
            int iC = ajzuVar.c(akbhVar);
            if (iC == -1) {
                if (i2 == 0) {
                    throw new ajpq("The target server failed to respond");
                }
                iC = -1;
            }
            akao akaoVar = new akao(i, akbhVar.b);
            akan akanVar = this.a;
            int i3 = akaoVar.b;
            String str = ((akae) akanVar).b.d;
            int length = str.length();
            if (akbhVar.b >= length + 4) {
                if (i3 == 0) {
                    while (i3 < akbhVar.b && akaz.a(akbhVar.charAt(i3))) {
                        i3++;
                    }
                }
                int i4 = i3 + length;
                if (i4 + 4 <= akbhVar.b) {
                    int i5 = i;
                    boolean z = true;
                    while (true) {
                        if (!z) {
                            break;
                        }
                        if (i5 < length) {
                            z = akbhVar.charAt(i3 + i5) == str.charAt(i5);
                            i5++;
                        } else if (akbhVar.charAt(i4) == '/') {
                            return this.c.a(akanVar.a(akbhVar, akaoVar));
                        }
                    }
                }
            }
            if (iC == -1) {
                throw new ajps("The server failed to respond with a valid HTTP response");
            }
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("Garbage in response: ".concat(akbhVar.toString()));
            }
            i2++;
            i = 0;
        }
    }
}
