.class public final LHf/i0;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LHf/j0;

.field public b:LHf/m;

.field public c:LHf/l0;

.field public d:LEf/m0;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:LHf/j0;

.field public g:I


# direct methods
.method public constructor <init>(LHf/j0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/i0;->f:LHf/j0;

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
    .locals 1

    .line 1
    iput-object p1, p0, LHf/i0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LHf/i0;->g:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LHf/i0;->g:I

    .line 9
    .line 10
    iget-object p1, p0, LHf/i0;->f:LHf/j0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, LHf/j0;->k(LHf/j0;LHf/m;Ljf/c;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    return-object p1
.end method
