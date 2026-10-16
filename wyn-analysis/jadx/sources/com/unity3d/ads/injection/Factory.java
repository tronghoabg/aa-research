package com.unity3d.ads.injection;

import ef.InterfaceC2525i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/injection/Factory;", "T", "Lef/i;", "Lkotlin/Function0;", "initializer", "<init>", "(Ltf/a;)V", "", "isInitialized", "()Z", "Ltf/a;", "getValue", "()Ljava/lang/Object;", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Factory<T> implements InterfaceC2525i {

    @NotNull
    private final a initializer;

    public Factory(@NotNull a initializer) {
        AbstractC3340k.e(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // ef.InterfaceC2525i
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    @Override // ef.InterfaceC2525i
    public boolean isInitialized() {
        return false;
    }
}
