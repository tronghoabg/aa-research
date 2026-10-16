package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class coc {
    public Object a;
    public Object b;

    /* JADX WARN: Type inference failed for: r10v2, types: [afec, java.lang.Object] */
    public coc(char[] cArr) {
        bii biiVar = agm.a;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.b = new aed(biiVar, fValueOf, (aei) biiVar.b.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(String str) {
        Object arrayList = this.a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a = arrayList;
        } else {
            ((ArrayList) arrayList).clear();
        }
        b(str, (ArrayList) arrayList);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void b(java.lang.String r24, java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coc.b(java.lang.String, java.util.ArrayList):void");
    }

    public final aan c() {
        Object obj = this.a;
        if (obj != null) {
            return (aan) obj;
        }
        aan aanVar = new aan(6);
        this.a = aanVar;
        return aanVar;
    }

    public coc(coc cocVar, djv djvVar) {
        this.b = cocVar;
        this.a = djvVar;
    }

    public coc(byte[] bArr) {
    }

    public coc() {
        this.b = new float[64];
    }
}
