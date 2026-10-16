package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahom {
    private final Iterator<Map.Entry<ahoo, Object>> iter;
    private final boolean messageSetWireFormat;
    private Map.Entry<ahoo, Object> next;
    final /* synthetic */ ahon this$0;

    private ahom(ahon ahonVar, boolean z) {
        this.this$0 = ahonVar;
        Iterator<Map.Entry<ahoo, Object>> it = ahonVar.extensions.iterator();
        this.iter = it;
        if (it.hasNext()) {
            this.next = it.next();
        }
        this.messageSetWireFormat = z;
    }

    public void writeUntil(int i, ahoe ahoeVar) throws IOException {
        while (true) {
            Map.Entry<ahoo, Object> entry = this.next;
            if (entry == null || entry.getKey().getNumber() >= i) {
                return;
            }
            ahoo key = this.next.getKey();
            if (this.messageSetWireFormat && key.getLiteJavaType() == ahqj.MESSAGE && !key.isRepeated()) {
                ahoeVar.writeMessageSetExtension(key.getNumber(), (ahpg) this.next.getValue());
            } else {
                ahoi.writeField(key, this.next.getValue(), ahoeVar);
            }
            this.next = this.iter.hasNext() ? this.iter.next() : null;
        }
    }

    public /* synthetic */ ahom(ahon ahonVar, boolean z, ahoj ahojVar) {
        this(ahonVar, z);
    }
}
