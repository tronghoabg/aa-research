package androidx.media;

import androidx.versionedparcelable.VersionedParcelable;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AudioAttributesImpl extends VersionedParcelable {

    /* compiled from: WazeSource */
    public interface Builder {
        AudioAttributesImpl build();

        Builder setContentType(int i2);

        Builder setFlags(int i2);

        Builder setLegacyStreamType(int i2);

        Builder setUsage(int i2);
    }

    Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();
}
