package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.metadata.MediationMetaData;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.InterfaceC4215d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/ForcefulPreservingByteStringPreferenceMigration;", "Lu1/d;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "Landroid/content/Context;", "context", "", MediationMetaData.KEY_NAME, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "Lcom/unity3d/ads/core/data/datasource/GetByteStringData;", "getByteStringData", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/datasource/GetByteStringData;)V", "Lef/C;", "cleanUp", "(Ljf/c;)Ljava/lang/Object;", "currentData", "", "shouldMigrate", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Ljf/c;)Ljava/lang/Object;", "migrate", "Landroid/content/Context;", "Ljava/lang/String;", "Lcom/unity3d/ads/core/data/datasource/GetByteStringData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ForcefulPreservingByteStringPreferenceMigration implements InterfaceC4215d {

    @NotNull
    private final Context context;

    @NotNull
    private final GetByteStringData getByteStringData;

    @NotNull
    private final String key;

    @NotNull
    private final String name;

    public ForcefulPreservingByteStringPreferenceMigration(@NotNull Context context, @NotNull String name, @NotNull String key, @NotNull GetByteStringData getByteStringData) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
    }

    @Override // u1.InterfaceC4215d
    @Nullable
    public Object cleanUp(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        return C2515C.f34653a;
    }

    @Override // u1.InterfaceC4215d
    public /* bridge */ /* synthetic */ Object migrate(Object obj, InterfaceC3103c interfaceC3103c) {
        return migrate((ByteStringStoreOuterClass.ByteStringStore) obj, (InterfaceC3103c<? super ByteStringStoreOuterClass.ByteStringStore>) interfaceC3103c);
    }

    @Override // u1.InterfaceC4215d
    public /* bridge */ /* synthetic */ Object shouldMigrate(Object obj, InterfaceC3103c interfaceC3103c) {
        return shouldMigrate((ByteStringStoreOuterClass.ByteStringStore) obj, (InterfaceC3103c<? super Boolean>) interfaceC3103c);
    }

    @Nullable
    public Object migrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull InterfaceC3103c<? super ByteStringStoreOuterClass.ByteStringStore> interfaceC3103c) {
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null);
        if (string == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        AbstractC3340k.d(byteStringStoreBuild, "newBuilder()\n           …\n                .build()");
        return byteStringStoreBuild;
    }

    @Nullable
    public Object shouldMigrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull InterfaceC3103c<? super Boolean> interfaceC3103c) {
        return Boolean.TRUE;
    }
}
