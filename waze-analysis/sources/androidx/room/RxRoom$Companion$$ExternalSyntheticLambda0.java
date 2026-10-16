package androidx.room;

import androidx.room.RxRoom;
import e.c.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class RxRoom$Companion$$ExternalSyntheticLambda0 {
    public /* synthetic */ RoomDatabase f$0;
    public /* synthetic */ String[] f$1;

    public /* synthetic */ RxRoom$Companion$$ExternalSyntheticLambda0(RoomDatabase roomDatabase, String[] strArr) {
        this.f$0 = roomDatabase;
        this.f$1 = strArr;
    }

    public final void subscribe(i iVar) {
        RxRoom.Companion.createObservable$lambda$4(this.f$0, this.f$1, iVar);
    }
}
