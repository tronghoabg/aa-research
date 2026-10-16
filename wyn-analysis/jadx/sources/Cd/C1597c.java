package cd;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import uc.C4286w;

/* renamed from: cd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1597c extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f19829d = new HashMap();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        ArrayList arrayList;
        switch (b5) {
            case -127:
                return new C1596b((Boolean) f(byteBuffer.get(), byteBuffer), (C1595a) f(byteBuffer.get(), byteBuffer));
            case -126:
                Integer num = (Integer) f(byteBuffer.get(), byteBuffer);
                Object objF = f(byteBuffer.get(), byteBuffer);
                if (objF == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    if (objF instanceof List) {
                        for (Object obj : (List) objF) {
                            if (obj instanceof String) {
                                arrayList2.add((String) obj);
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                return new C1595a(num, arrayList);
            case -125:
                return this.f19829d.get((Integer) f(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num2 = (Integer) f(byteBuffer.get(), byteBuffer);
                return new FormError(num2.intValue(), (String) f(byteBuffer.get(), byteBuffer));
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C1596b) {
            byteArrayOutputStream.write(-127);
            C1596b c1596b = (C1596b) obj;
            k(byteArrayOutputStream, c1596b.f19827a);
            k(byteArrayOutputStream, c1596b.f19828b);
            return;
        }
        if (obj instanceof C1595a) {
            byteArrayOutputStream.write(-126);
            C1595a c1595a = (C1595a) obj;
            k(byteArrayOutputStream, c1595a.f19825a);
            k(byteArrayOutputStream, c1595a.f19826b);
            return;
        }
        if (obj instanceof ConsentForm) {
            byteArrayOutputStream.write(-125);
            k(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            if (!(obj instanceof FormError)) {
                super.k(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-124);
            FormError formError = (FormError) obj;
            k(byteArrayOutputStream, Integer.valueOf(formError.getErrorCode()));
            k(byteArrayOutputStream, formError.getMessage());
        }
    }
}
