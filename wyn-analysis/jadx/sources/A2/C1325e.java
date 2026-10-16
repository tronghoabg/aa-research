package a2;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325e extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17160a = 1;

    public /* synthetic */ C1325e() {
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f17160a) {
            case 0:
                if (size() > 4) {
                }
                break;
            default:
                if (size() > FFmpegKitConfig.f24185c) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ C1325e(int i5, float f10, boolean z2) {
        super(i5, f10, z2);
    }
}
