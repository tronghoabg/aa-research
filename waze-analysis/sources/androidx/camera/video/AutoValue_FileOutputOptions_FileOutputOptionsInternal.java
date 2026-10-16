package androidx.camera.video;

import android.location.Location;
import androidx.camera.video.FileOutputOptions;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutoValue_FileOutputOptions_FileOutputOptionsInternal extends FileOutputOptions.FileOutputOptionsInternal {
    private final long durationLimitMillis;
    private final File file;
    private final long fileSizeLimit;
    private final Location location;

    private AutoValue_FileOutputOptions_FileOutputOptionsInternal(long j2, long j3, Location location, File file) {
        this.fileSizeLimit = j2;
        this.durationLimitMillis = j3;
        this.location = location;
        this.file = file;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FileOutputOptions.FileOutputOptionsInternal) {
            FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal = (FileOutputOptions.FileOutputOptionsInternal) obj;
            if (this.fileSizeLimit == fileOutputOptionsInternal.getFileSizeLimit() && this.durationLimitMillis == fileOutputOptionsInternal.getDurationLimitMillis() && ((location = this.location) != null ? location.equals(fileOutputOptionsInternal.getLocation()) : fileOutputOptionsInternal.getLocation() == null) && this.file.equals(fileOutputOptionsInternal.getFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    long getDurationLimitMillis() {
        return this.durationLimitMillis;
    }

    @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal
    File getFile() {
        return this.file;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    Location getLocation() {
        return this.location;
    }

    public int hashCode() {
        Location location = this.location;
        int iHashCode = location == null ? 0 : location.hashCode();
        long j2 = this.fileSizeLimit;
        long j3 = this.durationLimitMillis;
        return this.file.hashCode() ^ ((iHashCode ^ ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003)) * 1000003);
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.fileSizeLimit + ", durationLimitMillis=" + this.durationLimitMillis + ", location=" + this.location + ", file=" + this.file + "}";
    }

    /* compiled from: WazeSource */
    final class Builder extends FileOutputOptions.FileOutputOptionsInternal.Builder {
        private Long durationLimitMillis;
        private File file;
        private Long fileSizeLimit;
        private Location location;

        Builder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder, androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        public FileOutputOptions.FileOutputOptionsInternal build() {
            Long l2 = this.fileSizeLimit;
            Long l3 = this.durationLimitMillis;
            String strConcat = l2 == null ? " fileSizeLimit" : "";
            if (l3 == null) {
                strConcat = strConcat.concat(" durationLimitMillis");
            }
            if (this.file == null) {
                strConcat = strConcat.concat(" file");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_FileOutputOptions_FileOutputOptionsInternal(l2.longValue(), this.durationLimitMillis.longValue(), this.location, this.file);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        FileOutputOptions.FileOutputOptionsInternal.Builder setDurationLimitMillis(long j2) {
            this.durationLimitMillis = Long.valueOf(j2);
            return this;
        }

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        FileOutputOptions.FileOutputOptionsInternal.Builder setFile(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.file = file;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        FileOutputOptions.FileOutputOptionsInternal.Builder setFileSizeLimit(long j2) {
            this.fileSizeLimit = Long.valueOf(j2);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ FileOutputOptions.FileOutputOptionsInternal.Builder setLocation(Location location) {
            setLocation(location);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        FileOutputOptions.FileOutputOptionsInternal.Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ FileOutputOptions.FileOutputOptionsInternal.Builder setDurationLimitMillis(long j2) {
            setDurationLimitMillis(j2);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        /* bridge */ /* synthetic */ FileOutputOptions.FileOutputOptionsInternal.Builder setFileSizeLimit(long j2) {
            setFileSizeLimit(j2);
            return this;
        }
    }
}
