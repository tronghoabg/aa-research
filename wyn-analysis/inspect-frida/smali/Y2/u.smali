.class public final LY2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY2/h;

.field public final b:LQ1/u;

.field public final c:LJ5/y;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:J


# direct methods
.method public constructor <init>(LY2/h;LQ1/u;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/u;->a:LY2/h;

    .line 5
    .line 6
    iput-object p2, p0, LY2/u;->b:LQ1/u;

    .line 7
    .line 8
    new-instance p1, LJ5/y;

    .line 9
    .line 10
    const/16 p2, 0x40

    .line 11
    .line 12
    new-array v0, p2, [B

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p1, v0, p2, v1, v2}, LJ5/y;-><init>([BIIB)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LY2/u;->c:LJ5/y;

    .line 20
    .line 21
    return-void
.end method
