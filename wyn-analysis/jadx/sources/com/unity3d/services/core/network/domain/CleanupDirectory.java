package com.unity3d.services.core.network.domain;

import Af.f;
import Af.g;
import Af.j;
import Af.l;
import Af.n;
import Af.w;
import android.support.v4.media.session.b;
import com.unity3d.ads.core.log.Logger;
import ef.C2527k;
import ff.o;
import ff.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import qf.h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "Ljava/io/File;", "directory", "", "sizeLimitMb", "", "ageLimitMs", "Lef/C;", "invoke", "(Ljava/io/File;IJ)V", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CleanupDirectory {

    @NotNull
    private final Logger logger;

    public CleanupDirectory(@NotNull Logger logger) {
        AbstractC3340k.e(logger, "logger");
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1] */
    public final void invoke(@NotNull File directory, int sizeLimitMb, long ageLimitMs) {
        ?? r12;
        AbstractC3340k.e(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            this.logger.debug("Directory does not exist or is not a directory: " + directory + ", nothing to clean up.");
            return;
        }
        h hVar = h.f44276a;
        g gVarV = n.V(new j(directory), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        f fVar = new f(gVarV);
        long length = 0;
        long length2 = 0;
        while (fVar.hasNext()) {
            length2 += ((File) fVar.next()).length();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f fVar2 = new f(gVarV);
        while (fVar2.hasNext()) {
            Object next = fVar2.next();
            if (((File) next).lastModified() + ageLimitMs < jCurrentTimeMillis) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        long j8 = length2 - length;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        long j10 = sizeLimitMb * 1048576;
        if (j8 > j10) {
            j jVar = new j(o.j0(arrayList2), (CleanupDirectory$invoke$$inlined$sortedBy$1) new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return b.W(Long.valueOf(((File) t10).lastModified()), Long.valueOf(((File) t11).lastModified()));
                }
            });
            C2527k c2527k = new C2527k(Long.valueOf(j8), v.f35432a);
            CleanupDirectory$invoke$additionalFiles$2 operation = CleanupDirectory$invoke$additionalFiles$2.INSTANCE;
            AbstractC3340k.e(operation, "operation");
            Object obj = null;
            l lVarX = S3.f.x(new w(c2527k, jVar, operation, null));
            while (true) {
                if (!lVarX.hasNext()) {
                    break;
                }
                Object next2 = lVarX.next();
                if (((Number) ((C2527k) next2).f34671a).longValue() <= j10) {
                    obj = next2;
                    break;
                }
            }
            C2527k c2527k2 = (C2527k) obj;
            if (c2527k2 != null && (r12 = (List) c2527k2.f34672b) != 0) {
                arrayList2 = r12;
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((File) it3.next()).delete();
            }
        }
    }
}
