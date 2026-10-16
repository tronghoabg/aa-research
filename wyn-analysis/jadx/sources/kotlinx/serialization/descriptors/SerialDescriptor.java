package kotlinx.serialization.descriptors;

import S3.f;
import java.util.List;

/* loaded from: classes5.dex */
public interface SerialDescriptor {
    boolean b();

    int c(String str);

    int d();

    String e(int i5);

    List f(int i5);

    SerialDescriptor g(int i5);

    List getAnnotations();

    f getKind();

    String h();

    boolean i(int i5);

    boolean isInline();
}
