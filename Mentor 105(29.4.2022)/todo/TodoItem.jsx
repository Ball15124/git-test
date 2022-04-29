import { AccessTime } from '@mui/icons-material';
import {
	Box,
	Button,
	Card,
	CardActions,
	CardContent,
	CardMedia,
	Divider,
	Typography,
} from '@mui/material';
import React from 'react';

const TodoItem = ({ title }) => {
	return (
		<Card sx={{ maxWidth: 345 }}>
			<CardContent>
				<Typography gutterBottom variant="h5" component="div">
					{title}
				</Typography>
				<Typography variant="body2" color="text.secondary" gutterBottom>
					Reference site about Lorem Ipsum, giving information on its origins,
					as well as a random Lipsum generator.
					{/* TODO: Use description from the prop */}
				</Typography>
				<Box display="flex" alignItems="center">
					<AccessTime />
					<Typography variant="body2" color="text.primary" sx={{marginLeft: 1}}>
						Fri 29 Apr
						{/* TODO: Use moment (see https://momentjs.com/) to format time */}
					</Typography>
				</Box>
			</CardContent>
			<Divider />
			<CardActions>
				<Button size="small">Mark as complete</Button>
			</CardActions>
		</Card>
	);
};

export default TodoItem;
