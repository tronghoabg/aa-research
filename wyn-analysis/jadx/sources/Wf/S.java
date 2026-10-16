package Wf;

import ef.C2515C;
import ef.C2527k;
import java.util.Map;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes5.dex */
public final class S implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f15563a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f15564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15565c;

    /* renamed from: d, reason: collision with root package name */
    public final Uf.g f15566d;

    public S(KSerializer kSerializer, KSerializer kSerializer2, byte b5) {
        this.f15563a = kSerializer;
        this.f15564b = kSerializer2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object q4;
        SerialDescriptor descriptor = getDescriptor();
        Vf.a aVarB = decoder.b(descriptor);
        KSerializer kSerializer = this.f15564b;
        KSerializer kSerializer2 = this.f15563a;
        Object obj = AbstractC1240b0.f15578c;
        Object objD = obj;
        Object objD2 = objD;
        while (true) {
            int iM = aVarB.m(getDescriptor());
            if (iM == -1) {
                if (objD == obj) {
                    throw new Sf.f("Element 'key' is missing");
                }
                if (objD2 == obj) {
                    throw new Sf.f("Element 'value' is missing");
                }
                switch (this.f15565c) {
                    case 0:
                        q4 = new Q(objD, objD2);
                        break;
                    default:
                        q4 = new C2527k(objD, objD2);
                        break;
                }
                aVarB.c(descriptor);
                return q4;
            }
            if (iM == 0) {
                objD = aVarB.D(getDescriptor(), 0, kSerializer2, null);
            } else {
                if (iM != 1) {
                    throw new Sf.f(AbstractC3256n.g(iM, "Invalid index: "));
                }
                objD2 = aVarB.D(getDescriptor(), 1, kSerializer, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f15565c) {
        }
        return this.f15566d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        Vf.b bVarB = encoder.b(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.f15563a;
        switch (this.f15565c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3340k.e(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                C2527k c2527k = (C2527k) obj;
                AbstractC3340k.e(c2527k, "<this>");
                key = c2527k.f34671a;
                break;
        }
        bVarB.f(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.f15564b;
        switch (this.f15565c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC3340k.e(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                C2527k c2527k2 = (C2527k) obj;
                AbstractC3340k.e(c2527k2, "<this>");
                value = c2527k2.f34672b;
                break;
        }
        bVarB.f(descriptor2, 1, kSerializer2, value);
        bVarB.c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(final KSerializer kSerializer, final KSerializer kSerializer2, int i5) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f15565c = i5;
        switch (i5) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                final int i10 = 1;
                this.f15566d = Fe.g.r("kotlin.Pair", new SerialDescriptor[0], new tf.l() { // from class: Wf.P
                    @Override // tf.l
                    public final Object invoke(Object obj) {
                        Uf.a buildSerialDescriptor = (Uf.a) obj;
                        switch (i10) {
                            case 0:
                                AbstractC3340k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                Uf.a.a(buildSerialDescriptor, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, kSerializer.getDescriptor());
                                Uf.a.a(buildSerialDescriptor, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, kSerializer2.getDescriptor());
                                break;
                            default:
                                AbstractC3340k.e(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                Uf.a.a(buildSerialDescriptor, "first", kSerializer.getDescriptor());
                                Uf.a.a(buildSerialDescriptor, "second", kSerializer2.getDescriptor());
                                break;
                        }
                        return C2515C.f34653a;
                    }
                });
                break;
            default:
                final int i11 = 0;
                this.f15566d = Fe.g.s("kotlin.collections.Map.Entry", Uf.j.f12833r, new SerialDescriptor[0], new tf.l() { // from class: Wf.P
                    @Override // tf.l
                    public final Object invoke(Object obj) {
                        Uf.a buildSerialDescriptor = (Uf.a) obj;
                        switch (i11) {
                            case 0:
                                AbstractC3340k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                Uf.a.a(buildSerialDescriptor, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, kSerializer.getDescriptor());
                                Uf.a.a(buildSerialDescriptor, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, kSerializer2.getDescriptor());
                                break;
                            default:
                                AbstractC3340k.e(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                Uf.a.a(buildSerialDescriptor, "first", kSerializer.getDescriptor());
                                Uf.a.a(buildSerialDescriptor, "second", kSerializer2.getDescriptor());
                                break;
                        }
                        return C2515C.f34653a;
                    }
                });
                break;
        }
    }
}
