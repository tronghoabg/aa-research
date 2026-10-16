package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.MediaConstants;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MimeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {
    private final String audioMime;
    private final EncoderProfilesProvider baseProvider;
    private final Map<Integer, EncoderProfilesProxy> profilesCache;
    private final String videoMime;

    public MimeMatchedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, String str, String str2) {
        x.f(encoderProfilesProvider, "baseProvider");
        x.f(str, "videoMime");
        x.f(str2, "audioMime");
        this.baseProvider = encoderProfilesProvider;
        this.videoMime = str;
        this.audioMime = str2;
        this.profilesCache = new LinkedHashMap();
    }

    private final EncoderProfilesProxy filterProfiles(EncoderProfilesProxy encoderProfilesProxy) {
        if (!x.n(this.videoMime, MediaConstants.MIME_TYPE_UNSPECIFIED) || !x.n(this.audioMime, MediaConstants.MIME_TYPE_UNSPECIFIED)) {
            List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
            x.e(videoProfiles, "getVideoProfiles(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : videoProfiles) {
                EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
                if (x.n(this.videoMime, MediaConstants.MIME_TYPE_UNSPECIFIED) || x.n(videoProfileProxy.getMediaType(), this.videoMime)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            List<EncoderProfilesProxy.AudioProfileProxy> audioProfiles = encoderProfilesProxy.getAudioProfiles();
            x.e(audioProfiles, "getAudioProfiles(...)");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : audioProfiles) {
                EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) obj2;
                if (x.n(this.audioMime, MediaConstants.MIME_TYPE_UNSPECIFIED) || x.n(audioProfileProxy.getMediaType(), this.audioMime)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList2.size() != encoderProfilesProxy.getVideoProfiles().size() || arrayList4.size() != encoderProfilesProxy.getAudioProfiles().size()) {
                if (arrayList2.isEmpty() && arrayList4.isEmpty()) {
                    return null;
                }
                return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), arrayList4, arrayList2);
            }
        }
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i2) {
        EncoderProfilesProxy encoderProfilesProxy;
        synchronized (this.profilesCache) {
            Map<Integer, EncoderProfilesProxy> map = this.profilesCache;
            Integer numValueOf = Integer.valueOf(i2);
            EncoderProfilesProxy encoderProfilesProxyFilterProfiles = map.get(numValueOf);
            if (encoderProfilesProxyFilterProfiles == null) {
                EncoderProfilesProxy all = this.baseProvider.getAll(i2);
                encoderProfilesProxyFilterProfiles = all != null ? filterProfiles(all) : null;
                map.put(numValueOf, encoderProfilesProxyFilterProfiles);
            }
            encoderProfilesProxy = encoderProfilesProxyFilterProfiles;
        }
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i2) {
        return getAll(i2) != null;
    }

    public /* synthetic */ MimeMatchedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, String str, String str2, int i2, o oVar) {
        this(encoderProfilesProvider, (i2 & 2) != 0 ? MediaConstants.MIME_TYPE_UNSPECIFIED : str, (i2 & 4) != 0 ? MediaConstants.MIME_TYPE_UNSPECIFIED : str2);
    }
}
