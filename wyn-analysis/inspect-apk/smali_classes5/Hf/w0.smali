.class public final LHf/w0;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LHf/x0;

.field public b:LHf/m;

.field public c:LHf/y0;

.field public d:LEf/m0;

.field public e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:LHf/x0;

.field public h:I


# direct methods
.method public constructor <init>(LHf/x0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/w0;->g:LHf/x0;

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
    iput-object p1, p0, LHf/w0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LHf/w0;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LHf/w0;->h:I

    .line 9
    .line 10
    iget-object p1, p0, LHf/w0;->g:LHf/x0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    return-object p1
.end method
