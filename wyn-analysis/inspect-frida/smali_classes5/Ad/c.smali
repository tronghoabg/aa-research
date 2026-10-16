.class public final LAd/c;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LFd/d;

.field public b:Ljf/h;

.field public c:LQd/d;

.field public d:LMd/c;

.field public e:Ljava/net/HttpURLConnection;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:LAd/e;

.field public h:I


# direct methods
.method public constructor <init>(LAd/e;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LAd/c;->g:LAd/e;

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
    iput-object p1, p0, LAd/c;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LAd/c;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LAd/c;->h:I

    .line 9
    .line 10
    iget-object p1, p0, LAd/c;->g:LAd/e;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, LAd/e;->a(LFd/d;Llf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
