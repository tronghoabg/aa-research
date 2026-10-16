.class public final Lc4/b;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lc4/h;

.field public b:Lb4/m;

.field public c:LX3/b;

.field public d:Lh4/h;

.field public e:Ljava/lang/Object;

.field public f:Lh4/l;

.field public g:LX3/c;

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lc4/h;

.field public k:I


# direct methods
.method public constructor <init>(Lc4/h;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/b;->j:Lc4/h;

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
    .locals 8

    .line 1
    iput-object p1, p0, Lc4/b;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lc4/b;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lc4/b;->k:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Lc4/b;->j:Lc4/h;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    move-object v7, p0

    .line 19
    invoke-static/range {v0 .. v7}, Lc4/h;->a(Lc4/h;Lb4/m;LX3/b;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method
