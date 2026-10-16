package Wf;

import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public interface C extends KSerializer {
    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
