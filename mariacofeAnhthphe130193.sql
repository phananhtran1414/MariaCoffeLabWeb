USE [Maria]
GO
/****** Object:  Table [dbo].[Cake]    Script Date: 3/18/2020 6:14:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Cake]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[Cake](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Title] [varchar](200) NULL,
	[price] [float] NULL,
	[sortContent] [ntext] NULL,
	[Content] [ntext] NULL,
	[picture] [varchar](200) NULL,
 CONSTRAINT [PK_Cake] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[FindCafe]    Script Date: 3/18/2020 6:14:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[FindCafe]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[FindCafe](
	[id] [int] NOT NULL,
	[addres] [varchar](200) NOT NULL,
	[tel] [int] NOT NULL,
	[email] [varchar](200) NOT NULL,
	[closed] [varchar](100) NULL,
	[opened1] [varchar](100) NULL,
	[opened2] [varchar](100) NULL,
	[pictureMap] [varchar](100) NULL,
 CONSTRAINT [PK_FindCafe] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[HomePage]    Script Date: 3/18/2020 6:14:40 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[HomePage]') AND type in (N'U'))
BEGIN
CREATE TABLE [dbo].[HomePage](
	[id] [int] NOT NULL,
	[Title] [varchar](200) NULL,
	[context] [ntext] NULL,
	[picture] [varchar](100) NULL,
	[sign1] [varchar](100) NULL,
	[sign2] [varchar](100) NULL,
	[sortContent] [varchar](100) NULL,
	[address] [varchar](100) NULL,
	[phone] [varchar](100) NULL,
 CONSTRAINT [PK_HomePage] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET IDENTITY_INSERT [dbo].[Cake] ON 

INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (1, N'In the Afternoon', 9500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis ', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake1.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (2, N'Traditional Cakes', 10500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake2.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (4, N'In the Afternoon', 9500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake1.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (5, N'Traditional Cakes', 10500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake2.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (6, N'About my Cakes', 5500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (7, N'In the Afternoon', 9500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake1.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (8, N'Traditional Cakes', 10500, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake2.jpg')
INSERT [dbo].[Cake] ([id], [Title], [price], [sortContent], [Content], [picture]) VALUES (9, N'SAS', 7600, N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'cake1.jpg')
SET IDENTITY_INSERT [dbo].[Cake] OFF
INSERT [dbo].[FindCafe] ([id], [addres], [tel], [email], [closed], [opened1], [opened2], [pictureMap]) VALUES (1, N'Copenhagen, Denmark', 123456, N'your-email@your-email.com', N'Monday: Closed', N'Tuesday - Friday: 10:00 - 20:00', N'Saturday and Sunday: 11.00 - 21:00', N'map.png')
INSERT [dbo].[HomePage] ([id], [Title], [context], [picture], [sign1], [sign2], [sortContent], [address], [phone]) VALUES (1, N'Maria''s Cosy Cafe', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy 
 nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, 
 quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.', N'avata.jpg', N'Kind regards', N'Maria Bagnarelli', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', N'Gammel Torv, Copenhagen', N'12 1234 1234')
