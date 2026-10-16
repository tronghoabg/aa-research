.class public final Lc4/e;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lc4/h;

.field public b:LX3/b;

.field public c:Lh4/h;

.field public d:Ljava/lang/Object;

.field public e:Lh4/l;

.field public f:LX3/c;

.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lc4/h;

.field public j:I


# direct methods
.method public constructor <init>(Lc4/h;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/e;->i:Lc4/h;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iput-object p1, p0, Lc4/e;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lc4/e;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lc4/e;->j:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, Lc4/e;->i:Lc4/h;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, Lc4/h;->c(LX3/b;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
