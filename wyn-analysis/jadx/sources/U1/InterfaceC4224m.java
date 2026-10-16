package u1;

import java.io.InputStream;
import java.io.OutputStream;
import jf.InterfaceC3103c;

/* renamed from: u1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4224m {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, InterfaceC3103c interfaceC3103c);

    Object writeTo(Object obj, OutputStream outputStream, InterfaceC3103c interfaceC3103c);
}
