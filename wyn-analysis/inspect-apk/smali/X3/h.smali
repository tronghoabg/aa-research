.class public final LX3/h;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LX3/k;

.field public b:Lh4/a;

.field public c:Lh4/h;

.field public d:LX3/c;

.field public e:Landroid/graphics/Bitmap;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:LX3/k;

.field public h:I


# direct methods
.method public constructor <init>(LX3/k;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX3/h;->g:LX3/k;

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
    .locals 2

    .line 1
    iput-object p1, p0, LX3/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LX3/h;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LX3/h;->h:I

    .line 9
    .line 10
    iget-object p1, p0, LX3/h;->g:LX3/k;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p1, v0, v1, p0}, LX3/k;->a(LX3/k;Lh4/h;ILlf/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
