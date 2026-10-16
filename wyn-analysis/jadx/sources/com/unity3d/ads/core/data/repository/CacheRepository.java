package com.unity3d.ads.core.data.repository;

import com.google.android.gms.common.api.f;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import tf.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001Ji\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062,\b\u0002\u0010\r\u001a&\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "", "url", "Lorg/json/JSONArray;", "headers", "", "priority", "intervalMs", "Lkotlin/Function3;", "", "Ljf/c;", "Lef/C;", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILtf/q;Ljf/c;)Ljava/lang/Object;", "type", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", "fileName", "doesFileExist", "(Ljava/lang/String;Ljf/c;)Ljava/lang/Object;", "retrieveFile", "clearCache", "(Ljf/c;)Ljava/lang/Object;", "getCacheSize", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CacheRepository {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i5, int i10, q qVar, InterfaceC3103c interfaceC3103c, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i5 = 0;
            }
            if ((i11 & 8) != 0) {
                i10 = f.API_PRIORITY_OTHER;
            }
            if ((i11 & 16) != 0) {
                qVar = null;
            }
            return cacheRepository.getFile(str, jSONArray, i5, i10, qVar, interfaceC3103c);
        }
    }

    @Nullable
    Object clearCache(@NotNull InterfaceC3103c<? super C2515C> interfaceC3103c);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull InterfaceC3103c<? super Boolean> interfaceC3103c);

    @Nullable
    Object getCacheSize(@NotNull InterfaceC3103c<? super Long> interfaceC3103c);

    @Nullable
    Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i5, int i10, @Nullable q qVar, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c);

    @Nullable
    Object getWebviewFile(@NotNull String str, @NotNull String str2, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @Nullable
    Object retrieveFile(@NotNull String str, @NotNull InterfaceC3103c<? super CacheResult> interfaceC3103c);
}
