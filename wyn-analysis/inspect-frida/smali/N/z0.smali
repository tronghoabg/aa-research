.class public final LN/z0;
.super LX/A;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX/A;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/z0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LX/A;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/z0;

    .line 7
    .line 8
    iget-object p1, p1, LN/z0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p1, p0, LN/z0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public final b()LX/A;
    .locals 2

    .line 1
    new-instance v0, LN/z0;

    .line 2
    .line 3
    iget-object v1, p0, LN/z0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LN/z0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
