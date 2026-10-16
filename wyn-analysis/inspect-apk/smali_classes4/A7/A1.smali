.class public final LA7/A1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:J

.field public final b:J

.field public final synthetic c:LS3/s;


# direct methods
.method public constructor <init>(LS3/s;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA7/A1;->c:LS3/s;

    .line 5
    .line 6
    iput-wide p2, p0, LA7/A1;->a:J

    .line 7
    .line 8
    iput-wide p4, p0, LA7/A1;->b:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LA7/A1;->c:LS3/s;

    .line 2
    .line 3
    iget-object v0, v0, LS3/s;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LA7/x1;

    .line 6
    .line 7
    invoke-virtual {v0}, LA7/B0;->zzl()LA7/k0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, LA7/V;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, v2}, LA7/V;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
