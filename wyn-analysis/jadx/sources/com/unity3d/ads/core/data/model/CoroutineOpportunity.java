package com.unity3d.ads.core.data.model;

import Fe.e;
import com.google.protobuf.ByteString;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/model/CoroutineOpportunity;", "Ljf/f;", "Lcom/google/protobuf/ByteString;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "<init>", "(Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/ByteString;", "getValue", "()Lcom/google/protobuf/ByteString;", "Ljf/g;", "getKey", "()Ljf/g;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "Key", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineOpportunity implements InterfaceC3106f {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString value;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/data/model/CoroutineOpportunity$Key;", "Ljf/g;", "Lcom/unity3d/ads/core/data/model/CoroutineOpportunity;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.core.data.model.CoroutineOpportunity$Key, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC3107g {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CoroutineOpportunity(@NotNull ByteString value) {
        AbstractC3340k.e(value, "value");
        this.value = value;
    }

    @Override // jf.InterfaceC3108h
    public <R> R fold(R r10, @NotNull p pVar) {
        return (R) e.B(this, r10, pVar);
    }

    @Override // jf.InterfaceC3108h
    @Nullable
    public <E extends InterfaceC3106f> E get(@NotNull InterfaceC3107g interfaceC3107g) {
        return (E) e.C(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3106f
    @NotNull
    public InterfaceC3107g getKey() {
        return INSTANCE;
    }

    @NotNull
    public final ByteString getValue() {
        return this.value;
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public InterfaceC3108h minusKey(@NotNull InterfaceC3107g interfaceC3107g) {
        return e.N(this, interfaceC3107g);
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public InterfaceC3108h plus(@NotNull InterfaceC3108h interfaceC3108h) {
        return e.O(this, interfaceC3108h);
    }
}
