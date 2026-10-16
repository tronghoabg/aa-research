.class public final LN5/e;
.super LA7/B0;
.source "SourceFile"


# instance fields
.field public final b:LY4/b;

.field public final c:LY4/b;

.field public d:I

.field public e:Z

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>(LJ5/w;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LY4/b;

    .line 5
    .line 6
    sget-object v0, Lu6/a;->d:[B

    .line 7
    .line 8
    invoke-direct {p1, v0}, LY4/b;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LN5/e;->b:LY4/b;

    .line 12
    .line 13
    new-instance p1, LY4/b;

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p1, v0}, LY4/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LN5/e;->c:LY4/b;

    .line 20
    .line 21
    return-void
.end method
