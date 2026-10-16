package defpackage;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface uov extends Closeable {
    void clear() throws uox;

    int deleteExpired() throws uox;

    void deleteResource(pjw pjwVar) throws uox;

    void deleteTile(pjy pjyVar) throws uox;

    void flushWrites() throws uox;

    pjt getAndClearStats() throws uox;

    long getDatabaseSize() throws uox;

    pjv getResource(pjw pjwVar) throws abon, uox;

    int getServerDataVersion() throws uox;

    pjz getTile(pjy pjyVar) throws abon, uox;

    pka getTileMetadata(pjy pjyVar) throws abon, uox;

    boolean hasResource(pjw pjwVar) throws uox;

    boolean hasTile(pjy pjyVar) throws uox;

    void incrementalVacuum(long j) throws uox;

    void insertOrUpdateEmptyTile(pka pkaVar) throws uox;

    void insertOrUpdateResource(pjx pjxVar, byte[] bArr) throws uox;

    void insertOrUpdateTile(pka pkaVar, byte[] bArr) throws uox;

    void setServerDataVersion(int i) throws uox;

    void setStyleTablePriorityBoostMillis(long j);

    void trimToSize(long j) throws uox;

    void updateTileMetadata(pka pkaVar) throws uox;
}
