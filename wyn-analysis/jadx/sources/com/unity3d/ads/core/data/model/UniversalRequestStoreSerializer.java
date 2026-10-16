package com.unity3d.ads.core.data.model;

import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import ef.C2515C;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.C4212a;
import u1.InterfaceC4224m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/model/UniversalRequestStoreSerializer;", "Lu1/m;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Ljf/c;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "Lef/C;", "writeTo", "(Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;Ljava/io/OutputStream;Ljf/c;)Ljava/lang/Object;", "defaultValue", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "getDefaultValue", "()Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalRequestStoreSerializer implements InterfaceC4224m {

    @NotNull
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
        AbstractC3340k.d(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // u1.InterfaceC4224m
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull InterfaceC3103c<? super UniversalRequestStoreOuterClass.UniversalRequestStore> interfaceC3103c) throws C4212a {
        try {
            UniversalRequestStoreOuterClass.UniversalRequestStore from = UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
            AbstractC3340k.d(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e7) {
            throw new C4212a("Cannot read proto.", e7);
        } catch (Throwable th) {
            throw new C4212a("Error while reading proto file.", th);
        }
    }

    @Override // u1.InterfaceC4224m
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, InterfaceC3103c interfaceC3103c) {
        return writeTo((UniversalRequestStoreOuterClass.UniversalRequestStore) obj, outputStream, (InterfaceC3103c<? super C2515C>) interfaceC3103c);
    }

    @Override // u1.InterfaceC4224m
    @NotNull
    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    @Nullable
    public Object writeTo(@NotNull UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, @NotNull OutputStream outputStream, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) throws IOException {
        universalRequestStore.writeTo(outputStream);
        return C2515C.f34653a;
    }
}
