.class public final Lt0/s;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:Lt0/t;

.field public final synthetic j:J


# direct methods
.method public constructor <init>(Lt0/t;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt0/s;->i:Lt0/t;

    .line 2
    .line 3
    iput-wide p2, p0, Lt0/s;->j:J

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lt0/s;->i:Lt0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lt0/t;->y:Lt0/F;

    .line 4
    .line 5
    iget-object v0, v0, Lt0/F;->f:Lt0/y;

    .line 6
    .line 7
    iget-wide v1, p0, Lt0/s;->j:J

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Lr0/m;->e(J)Lr0/t;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lef/C;->a:Lef/C;

    .line 13
    .line 14
    return-object v0
.end method
