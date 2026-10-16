package androidx.room;

import androidx.room.RxRoom;
import e.c.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class RxRoom$Companion$$ExternalSyntheticLambda6 {
    public /* synthetic */ RoomDatabase f$0;
    public /* synthetic */ String[] f$1;

    public /* synthetic */ RxRoom$Companion$$ExternalSyntheticLambda6(RoomDatabase roomDatabase, String[] strArr) {
        this.f$0 = roomDatabase;
        this.f$1 = strArr;
    }

    public final void subscribe(e eVar) {
        RxRoom.Companion.createFlowable$lambda$1(this.f$0, this.f$1, eVar);
    }
}
